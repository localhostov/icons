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

public val Icons.Outline.MehRollingEyes: ImageVector
    get() {
        if (_mehRollingEyes != null) {
            return _mehRollingEyes!!
        }
        _mehRollingEyes = Builder(name = "MehRollingEyes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 6.0f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 13.0f, 10.0f)
                arcToRelative(3.779f, 3.779f, 0.0f, false, false, 3.5f, 4.0f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 20.0f, 10.0f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 16.5f, 6.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-0.813f, 0.0f, -1.5f, -0.916f, -1.5f, -2.0f)
                arcToRelative(2.479f, 2.479f, 0.0f, false, true, 0.148f, -0.85f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.7f, 0.0f)
                arcTo(2.479f, 2.479f, 0.0f, false, true, 18.0f, 10.0f)
                curveTo(18.0f, 11.084f, 17.313f, 12.0f, 16.5f, 12.0f)
                close()
                moveTo(11.0f, 10.0f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 7.5f, 6.0f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 4.0f, 10.0f)
                arcToRelative(3.779f, 3.779f, 0.0f, false, false, 3.5f, 4.0f)
                arcTo(3.779f, 3.779f, 0.0f, false, false, 11.0f, 10.0f)
                close()
                moveTo(7.5f, 12.0f)
                curveTo(6.687f, 12.0f, 6.0f, 11.084f, 6.0f, 10.0f)
                arcToRelative(2.479f, 2.479f, 0.0f, false, true, 0.148f, -0.85f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.7f, 0.0f)
                arcTo(2.479f, 2.479f, 0.0f, false, true, 9.0f, 10.0f)
                curveTo(9.0f, 11.084f, 8.313f, 12.0f, 7.5f, 12.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 18.0f)
                close()
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _mehRollingEyes!!
    }

private var _mehRollingEyes: ImageVector? = null
