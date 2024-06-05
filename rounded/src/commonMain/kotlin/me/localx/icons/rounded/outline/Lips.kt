package me.localx.icons.rounded.outline

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

public val Icons.Outline.Lips: ImageVector
    get() {
        if (_lips != null) {
            return _lips!!
        }
        _lips = Builder(name = "Lips", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.547f, 10.33f)
                curveToRelative(-2.025f, -3.282f, -4.577f, -5.646f, -6.289f, -6.763f)
                curveToRelative(-0.572f, -0.374f, -1.182f, -0.562f, -1.815f, -0.562f)
                horizontalLineToRelative(-0.023f)
                curveToRelative(-0.927f, 0.007f, -1.726f, 0.32f, -2.312f, 0.905f)
                lineToRelative(-1.116f, 1.099f)
                lineToRelative(-1.1f, -1.1f)
                curveToRelative(-0.586f, -0.586f, -1.368f, -0.909f, -2.2f, -0.909f)
                curveToRelative(-0.709f, 0.0f, -1.364f, 0.183f, -1.893f, 0.528f)
                curveToRelative(-1.607f, 1.05f, -4.23f, 3.459f, -6.333f, 6.793f)
                curveToRelative(-0.672f, 1.067f, -0.62f, 2.412f, 0.134f, 3.424f)
                curveToRelative(0.777f, 1.044f, 4.98f, 6.254f, 11.399f, 6.254f)
                reflectiveCurveToRelative(10.623f, -5.22f, 11.4f, -6.266f)
                curveToRelative(0.746f, -1.004f, 0.804f, -2.34f, 0.147f, -3.404f)
                close()
                moveTo(7.893f, 5.203f)
                curveToRelative(0.2f, -0.131f, 0.484f, -0.203f, 0.799f, -0.203f)
                curveToRelative(0.298f, 0.0f, 0.578f, 0.115f, 0.786f, 0.323f)
                lineToRelative(1.099f, 1.099f)
                curveToRelative(0.76f, 0.761f, 2.086f, 0.76f, 2.845f, 0.0f)
                lineToRelative(1.099f, -1.099f)
                curveToRelative(0.261f, -0.261f, 0.641f, -0.318f, 0.913f, -0.32f)
                curveToRelative(0.245f, 0.013f, 0.487f, 0.078f, 0.73f, 0.237f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.464f, 0.956f, 3.627f, 2.953f, 5.433f, 5.75f)
                curveToRelative(-0.869f, -0.165f, -5.44f, -0.991f, -9.598f, -0.991f)
                reflectiveCurveToRelative(-8.647f, 0.801f, -9.575f, 0.975f)
                curveToRelative(1.768f, -2.673f, 3.99f, -4.808f, 5.468f, -5.773f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-4.747f, 0.0f, -8.207f, -3.542f, -9.388f, -4.941f)
                curveToRelative(1.239f, 0.226f, 5.463f, 0.941f, 9.388f, 0.941f)
                reflectiveCurveToRelative(8.122f, -0.708f, 9.376f, -0.935f)
                curveToRelative(-1.193f, 1.412f, -4.645f, 4.935f, -9.376f, 4.935f)
                close()
            }
        }
        .build()
        return _lips!!
    }

private var _lips: ImageVector? = null
