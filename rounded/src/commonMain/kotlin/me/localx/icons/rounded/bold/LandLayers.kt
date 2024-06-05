package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.LandLayers: ImageVector
    get() {
        if (_landLayers != null) {
            return _landLayers!!
        }
        _landLayers = Builder(name = "LandLayers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.724f, 10.727f)
                lineToRelative(9.412f, 5.696f)
                curveToRelative(0.575f, 0.348f, 1.22f, 0.522f, 1.864f, 0.522f)
                reflectiveCurveToRelative(1.289f, -0.174f, 1.863f, -0.522f)
                lineToRelative(9.413f, -5.696f)
                curveToRelative(0.449f, -0.271f, 0.724f, -0.758f, 0.724f, -1.283f)
                reflectiveCurveToRelative(-0.274f, -1.012f, -0.724f, -1.283f)
                lineTo(13.863f, 2.464f)
                curveToRelative(-1.149f, -0.696f, -2.577f, -0.696f, -3.727f, 0.0f)
                lineTo(0.724f, 8.16f)
                curveToRelative(-0.449f, 0.271f, -0.724f, 0.758f, -0.724f, 1.283f)
                reflectiveCurveToRelative(0.274f, 1.012f, 0.724f, 1.283f)
                close()
                moveTo(12.31f, 13.857f)
                curveToRelative(-0.19f, 0.115f, -0.428f, 0.115f, -0.62f, 0.0f)
                lineToRelative(-2.45f, -1.483f)
                lineToRelative(2.803f, -1.682f)
                lineToRelative(2.76f, 1.656f)
                lineToRelative(-2.493f, 1.508f)
                close()
                moveTo(16.739f, 11.177f)
                lineToRelative(-2.752f, -1.651f)
                lineToRelative(2.888f, -1.733f)
                lineToRelative(2.728f, 1.651f)
                lineToRelative(-2.864f, 1.733f)
                close()
                moveTo(11.69f, 5.031f)
                curveToRelative(0.191f, -0.115f, 0.43f, -0.115f, 0.621f, 0.0f)
                lineToRelative(2.628f, 1.591f)
                lineToRelative(-2.897f, 1.738f)
                lineToRelative(-2.939f, -1.763f)
                lineToRelative(2.587f, -1.565f)
                close()
                moveTo(7.168f, 7.768f)
                lineToRelative(2.931f, 1.758f)
                lineToRelative(-2.795f, 1.677f)
                lineToRelative(-2.906f, -1.759f)
                lineToRelative(2.77f, -1.676f)
                close()
                moveTo(23.277f, 16.728f)
                lineToRelative(-9.413f, 5.696f)
                curveToRelative(-0.574f, 0.348f, -1.219f, 0.522f, -1.863f, 0.522f)
                reflectiveCurveToRelative(-1.289f, -0.175f, -1.864f, -0.522f)
                lineTo(0.724f, 16.727f)
                curveToRelative(-0.709f, -0.429f, -0.936f, -1.351f, -0.507f, -2.06f)
                curveToRelative(0.428f, -0.709f, 1.351f, -0.938f, 2.06f, -0.507f)
                lineToRelative(9.413f, 5.696f)
                curveToRelative(0.192f, 0.115f, 0.43f, 0.115f, 0.62f, 0.0f)
                lineToRelative(9.414f, -5.696f)
                curveToRelative(0.708f, -0.432f, 1.63f, -0.202f, 2.06f, 0.507f)
                reflectiveCurveToRelative(0.202f, 1.631f, -0.507f, 2.06f)
                close()
            }
        }
        .build()
        return _landLayers!!
    }

private var _landLayers: ImageVector? = null
