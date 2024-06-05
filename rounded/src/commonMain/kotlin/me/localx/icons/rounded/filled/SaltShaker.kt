package me.localx.icons.rounded.filled

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

public val Icons.Filled.SaltShaker: ImageVector
    get() {
        if (_saltShaker != null) {
            return _saltShaker!!
        }
        _saltShaker = Builder(name = "SaltShaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 7.0f)
                curveToRelative(-1.0f, 0.0f, -1.0f, -1.0f, -1.0f, -1.0f)
                curveTo(4.0f, 1.922f, 6.589f, 0.618f, 9.0f, 0.2f)
                verticalLineToRelative(1.8f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(11.0f, 0.011f)
                curveToRelative(0.37f, -0.011f, 0.709f, -0.011f, 1.0f, -0.011f)
                reflectiveCurveToRelative(0.63f, 0.0f, 1.0f, 0.011f)
                verticalLineToRelative(1.989f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                lineTo(15.0f, 0.2f)
                curveToRelative(2.411f, 0.418f, 5.0f, 1.722f, 5.0f, 5.8f)
                curveToRelative(0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(21.908f, 17.507f)
                lineToRelative(-1.53f, -7.702f)
                curveToRelative(-0.093f, -0.468f, -0.504f, -0.805f, -0.981f, -0.805f)
                lineTo(4.603f, 9.0f)
                curveToRelative(-0.477f, 0.0f, -0.888f, 0.337f, -0.981f, 0.805f)
                lineToRelative(-1.545f, 7.782f)
                curveToRelative(-0.269f, 1.599f, 0.177f, 3.226f, 1.225f, 4.464f)
                curveToRelative(1.047f, 1.238f, 2.578f, 1.948f, 4.199f, 1.948f)
                horizontalLineToRelative(8.999f)
                curveToRelative(1.634f, 0.0f, 3.172f, -0.719f, 4.22f, -1.973f)
                curveToRelative(1.048f, -1.254f, 1.482f, -2.895f, 1.189f, -4.521f)
                close()
                moveTo(13.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 17.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _saltShaker!!
    }

private var _saltShaker: ImageVector? = null
