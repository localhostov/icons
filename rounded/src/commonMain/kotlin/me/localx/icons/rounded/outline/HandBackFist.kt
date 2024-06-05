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

public val Icons.Outline.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.006f, 1.954f)
                lineTo(9.899f, 0.084f)
                curveToRelative(-1.207f, -0.248f, -2.444f, 0.057f, -3.398f, 0.834f)
                curveToRelative(-0.954f, 0.778f, -1.501f, 1.93f, -1.501f, 3.161f)
                verticalLineToRelative(0.181f)
                lineToRelative(-3.815f, 3.782f)
                curveToRelative(-1.543f, 1.529f, -1.574f, 4.047f, -0.067f, 5.615f)
                lineToRelative(4.883f, 5.065f)
                verticalLineToRelative(1.277f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-2.808f)
                lineToRelative(1.428f, -3.569f)
                curveToRelative(0.38f, -0.949f, 0.572f, -1.948f, 0.572f, -2.971f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.0f, -2.363f, -1.68f, -4.423f, -3.994f, -4.898f)
                close()
                moveTo(21.0f, 10.652f)
                curveToRelative(0.0f, 0.767f, -0.145f, 1.517f, -0.43f, 2.229f)
                lineToRelative(-1.499f, 3.749f)
                curveToRelative(-0.047f, 0.118f, -0.071f, 0.244f, -0.071f, 0.371f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-1.68f)
                curveToRelative(0.0f, -0.259f, -0.101f, -0.508f, -0.28f, -0.694f)
                lineTo(2.558f, 12.271f)
                curveToRelative(-0.752f, -0.783f, -0.736f, -2.042f, 0.035f, -2.808f)
                lineToRelative(2.407f, -2.387f)
                verticalLineToRelative(3.923f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(7.0f, 4.08f)
                curveToRelative(0.0f, -0.627f, 0.279f, -1.214f, 0.766f, -1.611f)
                curveToRelative(0.486f, -0.396f, 1.119f, -0.55f, 1.731f, -0.425f)
                lineToRelative(9.106f, 1.869f)
                curveToRelative(1.389f, 0.285f, 2.396f, 1.521f, 2.396f, 2.939f)
                verticalLineToRelative(3.8f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
