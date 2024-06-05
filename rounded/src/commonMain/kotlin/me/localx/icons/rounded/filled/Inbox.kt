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

public val Icons.Filled.Inbox: ImageVector
    get() {
        if (_inbox != null) {
            return _inbox!!
        }
        _inbox = Builder(name = "Inbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 213.333f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-23.564f, 0.0f, -42.667f, 19.103f, -42.667f, 42.667f)
                reflectiveCurveToRelative(-19.103f, 42.667f, -42.667f, 42.667f)
                horizontalLineToRelative(-85.333f)
                curveToRelative(-23.564f, 0.0f, -42.667f, -19.103f, -42.667f, -42.667f)
                reflectiveCurveTo(151.564f, 213.333f, 128.0f, 213.333f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.346f, 0.0f, -64.0f, 28.654f, -64.0f, 64.0f)
                verticalLineToRelative(85.333f)
                curveToRelative(0.071f, 58.881f, 47.786f, 106.596f, 106.667f, 106.667f)
                horizontalLineToRelative(298.667f)
                curveTo(464.214f, 469.263f, 511.93f, 421.548f, 512.0f, 362.667f)
                verticalLineToRelative(-85.333f)
                curveTo(512.0f, 241.987f, 483.346f, 213.333f, 448.0f, 213.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 170.667f)
                horizontalLineToRelative(384.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveToRelative(0.0f, -11.782f, -9.551f, -21.333f, -21.333f, -21.333f)
                horizontalLineTo(64.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                curveTo(42.667f, 161.115f, 52.218f, 170.667f, 64.0f, 170.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 85.333f)
                horizontalLineToRelative(384.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                reflectiveCurveTo(459.782f, 42.667f, 448.0f, 42.667f)
                horizontalLineTo(64.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                reflectiveCurveTo(52.218f, 85.333f, 64.0f, 85.333f)
                close()
            }
        }
        .build()
        return _inbox!!
    }

private var _inbox: ImageVector? = null
