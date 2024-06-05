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

public val Icons.Filled.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(489.797f, 256.0f)
                curveToRelative(-10.791f, -0.141f, -19.924f, 7.939f, -21.099f, 18.667f)
                curveToRelative(-9.959f, 117.754f, -113.491f, 205.138f, -231.245f, 195.179f)
                reflectiveCurveTo(32.315f, 356.354f, 42.275f, 238.6f)
                reflectiveCurveTo(155.766f, 33.462f, 273.52f, 43.421f)
                curveToRelative(50.983f, 4.312f, 98.733f, 26.75f, 134.592f, 63.245f)
                horizontalLineToRelative(-66.603f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                reflectiveCurveToRelative(9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(88.384f)
                curveToRelative(21.874f, -0.012f, 39.604f, -17.742f, 39.616f, -39.616f)
                verticalLineTo(21.333f)
                curveTo(469.509f, 9.551f, 459.958f, 0.0f, 448.176f, 0.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                verticalLineToRelative(44.331f)
                curveTo(321.548f, -28.425f, 159.915f, -19.341f, 65.826f, 85.954f)
                reflectiveCurveToRelative(-85.005f, 266.927f, 20.29f, 361.016f)
                reflectiveCurveToRelative(266.927f, 85.005f, 361.016f, -20.29f)
                curveToRelative(36.575f, -40.931f, 59.007f, -92.547f, 63.977f, -147.214f)
                curveToRelative(1.096f, -11.814f, -7.593f, -22.279f, -19.407f, -23.375f)
                curveTo(491.069f, 256.033f, 490.434f, 256.002f, 489.797f, 256.0f)
                close()
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
