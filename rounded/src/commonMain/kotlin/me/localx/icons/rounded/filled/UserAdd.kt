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

public val Icons.Filled.UserAdd: ImageVector
    get() {
        if (_userAdd != null) {
            return _userAdd!!
        }
        _userAdd = Builder(name = "UserAdd", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(490.667f, 234.667f)
                horizontalLineTo(448.0f)
                verticalLineTo(192.0f)
                curveToRelative(0.0f, -11.782f, -9.551f, -21.333f, -21.333f, -21.333f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                verticalLineToRelative(42.667f)
                horizontalLineToRelative(-42.667f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(42.667f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                verticalLineToRelative(-42.667f)
                horizontalLineToRelative(42.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(512.0f, 244.218f, 502.449f, 234.667f, 490.667f, 234.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 128.0f)
                moveToRelative(-128.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, -256.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 298.667f)
                curveToRelative(-105.99f, 0.118f, -191.882f, 86.01f, -192.0f, 192.0f)
                curveTo(0.0f, 502.449f, 9.551f, 512.0f, 21.333f, 512.0f)
                horizontalLineToRelative(341.333f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(383.882f, 384.677f, 297.99f, 298.784f, 192.0f, 298.667f)
                close()
            }
        }
        .build()
        return _userAdd!!
    }

private var _userAdd: ImageVector? = null
