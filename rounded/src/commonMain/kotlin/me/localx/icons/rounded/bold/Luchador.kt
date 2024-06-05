package me.localx.icons.rounded.bold

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

public val Icons.Bold.Luchador: ImageVector
    get() {
        if (_luchador != null) {
            return _luchador!!
        }
        _luchador = Builder(name = "Luchador", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(8.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(5.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, false, 0.207f, 0.507f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 13.0f)
                close()
                moveTo(16.0f, 9.5f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, true, -0.207f, 0.507f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(19.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                close()
                moveTo(24.0f, 12.0f)
                verticalLineToRelative(6.682f)
                arcTo(5.324f, 5.324f, 0.0f, false, true, 18.682f, 24.0f)
                horizontalLineToRelative(-0.87f)
                arcToRelative(4.485f, 4.485f, 0.0f, false, true, -3.991f, -2.422f)
                lineToRelative(-0.36f, -0.692f)
                arcToRelative(1.648f, 1.648f, 0.0f, false, false, -2.922f, 0.0f)
                lineToRelative(-0.36f, 0.692f)
                arcTo(4.486f, 4.486f, 0.0f, false, true, 6.187f, 24.0f)
                lineTo(5.318f, 24.0f)
                arcTo(5.324f, 5.324f, 0.0f, false, true, 0.0f, 18.682f)
                lineTo(0.0f, 12.348f)
                arcTo(12.241f, 12.241f, 0.0f, false, true, 11.776f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                arcToRelative(8.932f, 8.932f, 0.0f, false, false, -2.695f, -6.422f)
                arcTo(9.034f, 9.034f, 0.0f, false, false, 11.831f, 3.0f)
                arcTo(9.226f, 9.226f, 0.0f, false, false, 3.0f, 12.348f)
                verticalLineToRelative(6.334f)
                arcTo(2.321f, 2.321f, 0.0f, false, false, 5.318f, 21.0f)
                horizontalLineToRelative(0.869f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.332f, -0.808f)
                lineToRelative(0.36f, -0.692f)
                arcToRelative(4.647f, 4.647f, 0.0f, false, true, 8.242f, 0.0f)
                lineToRelative(0.36f, 0.692f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.812f, 21.0f)
                horizontalLineToRelative(0.87f)
                arcTo(2.321f, 2.321f, 0.0f, false, false, 21.0f, 18.682f)
                close()
            }
        }
        .build()
        return _luchador!!
    }

private var _luchador: ImageVector? = null
