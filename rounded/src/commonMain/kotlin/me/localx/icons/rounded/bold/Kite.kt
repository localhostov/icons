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

public val Icons.Bold.Kite: ImageVector
    get() {
        if (_kite != null) {
            return _kite!!
        }
        _kite = Builder(name = "Kite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.451f, 15.95f)
                arcToRelative(5.512f, 5.512f, 0.0f, false, false, -3.924f, 1.626f)
                curveTo(12.224f, 19.88f, 8.985f, 21.0f, 4.627f, 21.0f)
                horizontalLineToRelative(-1.1f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, -0.37f, -0.9f)
                lineTo(5.464f, 17.8f)
                lineToRelative(11.453f, -3.054f)
                arcTo(5.505f, 5.505f, 0.0f, false, false, 21.0f, 9.427f)
                verticalLineTo(5.5f)
                arcTo(5.507f, 5.507f, 0.0f, false, false, 15.5f, 0.0f)
                horizontalLineTo(11.573f)
                arcTo(5.505f, 5.505f, 0.0f, false, false, 6.259f, 4.083f)
                lineTo(3.105f, 15.91f)
                lineToRelative(-2.07f, 2.072f)
                arcTo(3.526f, 3.526f, 0.0f, false, false, 3.528f, 24.0f)
                horizontalLineToRelative(1.1f)
                curveToRelative(5.122f, 0.0f, 9.167f, -1.447f, 12.021f, -4.3f)
                arcTo(2.549f, 2.549f, 0.0f, false, true, 21.0f, 21.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcTo(5.555f, 5.555f, 0.0f, false, false, 18.451f, 15.95f)
                close()
                moveTo(9.157f, 4.856f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, 0.631f, -1.1f)
                lineTo(13.7f, 7.438f)
                lineToRelative(3.629f, -3.63f)
                arcTo(2.483f, 2.483f, 0.0f, false, true, 18.0f, 5.5f)
                verticalLineTo(9.427f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.546f, 1.554f)
                lineTo(13.7f, 7.438f)
                lineTo(6.661f, 14.371f)
                lineToRelative(-0.044f, 0.012f)
                close()
            }
        }
        .build()
        return _kite!!
    }

private var _kite: ImageVector? = null
