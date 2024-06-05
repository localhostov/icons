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

public val Icons.Filled.Luchador: ImageVector
    get() {
        if (_luchador != null) {
            return _luchador!!
        }
        _luchador = Builder(name = "Luchador", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(6.0f, 11.829f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 13.0f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(18.0f, 11.829f)
                arcTo(3.009f, 3.009f, 0.0f, false, true, 17.0f, 12.0f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-0.046f)
                lineToRelative(0.0f, -0.007f)
                curveToRelative(-2.341f, 0.0f, -3.1f, -1.593f, -3.627f, -2.556f)
                lineToRelative(-0.371f, -0.681f)
                arcTo(3.369f, 3.369f, 0.0f, false, false, 12.0f, 19.0f)
                lineToRelative(-0.022f, 0.033f)
                lineTo(11.956f, 19.0f)
                horizontalLineToRelative(0.0f)
                arcTo(3.368f, 3.368f, 0.0f, false, false, 9.0f, 20.756f)
                lineToRelative(-0.371f, 0.681f)
                curveTo(8.1f, 22.4f, 7.34f, 23.993f, 5.0f, 23.993f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(0.0f, 12.365f)
                arcTo(12.248f, 12.248f, 0.0f, false, true, 11.775f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(11.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(7.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 9.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(9.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(20.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(16.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _luchador!!
    }

private var _luchador: ImageVector? = null
