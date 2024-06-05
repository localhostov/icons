package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.CatSpace: ImageVector
    get() {
        if (_catSpace != null) {
            return _catSpace!!
        }
        _catSpace = Builder(name = "CatSpace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.5f, 4.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-1.0f, -2.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.558f, 24.0f)
                curveToRelative(-3.224f, 0.0f, -6.558f, -2.058f, -6.558f, -5.5f)
                curveToRelative(0.0f, -2.135f, 0.945f, -3.659f, 1.778f, -5.004f)
                curveToRelative(0.655f, -1.057f, 1.222f, -1.969f, 1.222f, -2.996f)
                curveToRelative(0.0f, -1.299f, -0.363f, -2.5f, -3.0f, -2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(4.351f, 0.0f, 5.0f, 2.819f, 5.0f, 4.5f)
                curveToRelative(0.0f, 1.597f, -0.773f, 2.844f, -1.521f, 4.051f)
                curveToRelative(-0.761f, 1.226f, -1.479f, 2.384f, -1.479f, 3.949f)
                curveToRelative(0.0f, 1.791f, 1.467f, 2.851f, 2.997f, 3.279f)
                curveToRelative(0.007f, -1.265f, 0.344f, -7.635f, 6.23f, -10.825f)
                curveToRelative(-0.774f, -1.126f, -1.227f, -2.488f, -1.227f, -3.954f)
                curveToRelative(0.0f, -3.859f, 3.141f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                curveToRelative(0.0f, 1.903f, -0.764f, 3.63f, -2.0f, 4.893f)
                verticalLineToRelative(10.107f)
                close()
                moveTo(13.0f, 7.0f)
                curveToRelative(0.0f, 2.205f, 1.795f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.795f, 4.0f, -4.0f)
                lineTo(21.0f, 3.0f)
                lineToRelative(-2.028f, 1.521f)
                curveToRelative(-0.582f, -0.331f, -1.255f, -0.521f, -1.972f, -0.521f)
                reflectiveCurveToRelative(-1.39f, 0.19f, -1.972f, 0.521f)
                lineToRelative(-2.028f, -1.521f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.676f)
                curveToRelative(-0.91f, 0.433f, -1.927f, 0.676f, -3.0f, 0.676f)
                curveToRelative(-1.645f, 0.0f, -3.16f, -0.571f, -4.357f, -1.525f)
                curveToRelative(-5.887f, 2.824f, -5.658f, 9.189f, -5.644f, 9.476f)
                verticalLineToRelative(0.05f)
                horizontalLineToRelative(9.001f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, 2.691f, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _catSpace!!
    }

private var _catSpace: ImageVector? = null
