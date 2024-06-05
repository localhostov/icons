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

public val Icons.Outline.Luchador: ImageVector
    get() {
        if (_luchador != null) {
            return _luchador!!
        }
        _luchador = Builder(name = "Luchador", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                lineTo(13.0f, 16.0f)
                lineTo(13.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 16.0f)
                close()
                moveTo(15.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(18.0f, 12.0f)
                lineTo(16.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(11.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(4.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(6.0f, 12.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(9.0f, 14.0f)
                lineTo(9.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(24.0f, 24.0f)
                lineTo(15.588f, 24.0f)
                lineTo(14.08f, 21.234f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, false, -4.16f, 0.0f)
                lineTo(8.412f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 12.365f)
                arcTo(12.248f, 12.248f, 0.0f, false, true, 11.775f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(16.775f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 11.812f, 2.0f)
                horizontalLineToRelative(0.0f)
                arcTo(10.238f, 10.238f, 0.0f, false, false, 2.0f, 12.365f)
                lineTo(2.0f, 22.0f)
                lineTo(7.225f, 22.0f)
                lineToRelative(0.939f, -1.723f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, true, 7.672f, 0.0f)
                close()
            }
        }
        .build()
        return _luchador!!
    }

private var _luchador: ImageVector? = null
