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

public val Icons.Filled.Following: ImageVector
    get() {
        if (_following != null) {
            return _following!!
        }
        _following = Builder(name = "Following", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.047f, viewportHeight = 512.047f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 128.024f)
                moveToRelative(-128.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, -256.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 298.69f)
                curveTo(86.015f, 298.82f, 0.129f, 384.705f, 0.0f, 490.69f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                horizontalLineToRelative(341.333f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(383.871f, 384.705f, 297.985f, 298.82f, 192.0f, 298.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.333f, 168.024f)
                curveToRelative(-24.717f, 1.231f, -43.79f, 22.211f, -42.667f, 46.933f)
                curveToRelative(1.123f, -24.722f, -17.949f, -45.702f, -42.667f, -46.933f)
                curveToRelative(-24.717f, 1.231f, -43.79f, 22.211f, -42.667f, 46.933f)
                curveToRelative(0.0f, 36.907f, 48.128f, 80.149f, 72.107f, 99.392f)
                curveToRelative(7.731f, 6.19f, 18.722f, 6.19f, 26.453f, 0.0f)
                curveToRelative(23.979f, -19.2f, 72.107f, -62.485f, 72.107f, -99.392f)
                curveTo(513.123f, 190.234f, 494.051f, 169.255f, 469.333f, 168.024f)
                close()
            }
        }
        .build()
        return _following!!
    }

private var _following: ImageVector? = null
