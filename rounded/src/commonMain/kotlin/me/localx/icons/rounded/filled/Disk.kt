package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Disk: ImageVector
    get() {
        if (_disk != null) {
            return _disk!!
        }
        _disk = Builder(name = "Disk", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 298.667f)
                moveToRelative(-42.667f, 0.0f)
                arcToRelative(42.667f, 42.667f, 0.0f, true, true, 85.334f, 0.0f)
                arcToRelative(42.667f, 42.667f, 0.0f, true, true, -85.334f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.768f, 87.936f)
                lineToRelative(-56.704f, -56.704f)
                curveToRelative(-5.674f, -5.585f, -11.957f, -10.515f, -18.731f, -14.699f)
                verticalLineTo(64.0f)
                curveToRelative(-0.071f, 58.881f, -47.786f, 106.596f, -106.667f, 106.667f)
                horizontalLineToRelative(-85.333f)
                curveTo(154.452f, 170.596f, 106.737f, 122.881f, 106.667f, 64.0f)
                verticalLineTo(0.0f)
                curveTo(47.786f, 0.071f, 0.071f, 47.786f, 0.0f, 106.667f)
                verticalLineToRelative(298.667f)
                curveTo(0.071f, 464.215f, 47.786f, 511.93f, 106.667f, 512.0f)
                horizontalLineToRelative(298.667f)
                curveTo(464.214f, 511.93f, 511.93f, 464.215f, 512.0f, 405.334f)
                verticalLineTo(163.35f)
                curveTo(512.08f, 135.049f, 500.833f, 107.893f, 480.768f, 87.936f)
                close()
                moveTo(256.0f, 384.0f)
                curveToRelative(-47.128f, 0.0f, -85.333f, -38.205f, -85.333f, -85.333f)
                reflectiveCurveToRelative(38.205f, -85.333f, 85.333f, -85.333f)
                reflectiveCurveToRelative(85.333f, 38.205f, 85.333f, 85.333f)
                reflectiveCurveTo(303.128f, 384.0f, 256.0f, 384.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.333f, 128.0f)
                horizontalLineToRelative(85.333f)
                curveToRelative(35.346f, 0.0f, 64.0f, -28.654f, 64.0f, -64.0f)
                verticalLineTo(1.366f)
                curveToRelative(-4.638f, -0.756f, -9.32f, -1.212f, -14.016f, -1.365f)
                horizontalLineTo(149.333f)
                verticalLineToRelative(64.0f)
                curveTo(149.333f, 99.346f, 177.987f, 128.0f, 213.333f, 128.0f)
                close()
            }
        }
        .build()
        return _disk!!
    }

private var _disk: ImageVector? = null
