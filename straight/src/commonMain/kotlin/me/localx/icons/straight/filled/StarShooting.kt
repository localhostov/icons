package me.localx.icons.straight.filled

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

public val Icons.Filled.StarShooting: ImageVector
    get() {
        if (_starShooting != null) {
            return _starShooting!!
        }
        _starShooting = Builder(name = "StarShooting", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.963f, 1.45f)
                lineToRelative(-10.564f, 10.564f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(22.549f, 0.036f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(13.963f, 3.45f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-5.564f, 5.564f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.564f, -5.564f)
                close()
                moveTo(14.985f, 15.6f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.564f, -5.564f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-5.564f, 5.564f)
                close()
                moveTo(6.498f, 11.519f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(-1.178f, 4.5f)
                lineTo(0.0f, 16.019f)
                verticalLineToRelative(0.922f)
                lineToRelative(3.323f, 1.848f)
                lineToRelative(-1.304f, 4.076f)
                lineToRelative(0.721f, 0.543f)
                lineToRelative(3.275f, -2.532f)
                lineToRelative(3.261f, 2.521f)
                lineToRelative(0.75f, -0.523f)
                lineToRelative(-1.326f, -4.029f)
                lineToRelative(3.3f, -1.909f)
                verticalLineToRelative(-0.917f)
                horizontalLineToRelative(-4.326f)
                lineToRelative(-1.176f, -4.5f)
                close()
            }
        }
        .build()
        return _starShooting!!
    }

private var _starShooting: ImageVector? = null
