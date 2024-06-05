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

public val Icons.Filled.Chess: ImageVector
    get() {
        if (_chess != null) {
            return _chess!!
        }
        _chess = Builder(name = "Chess", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                verticalLineToRelative(7.0f)
                lineTo(14.0f, 18.0f)
                lineTo(14.0f, 11.0f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(11.9f, 4.411f)
                lineTo(11.853f, 4.521f)
                lineTo(10.63f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(0.391f)
                lineTo(2.113f, 4.411f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.7f, -2.4f)
                horizontalLineToRelative(2.2f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.7f, 2.4f)
                close()
                moveTo(14.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 23.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(3.791f, 11.0f)
                arcToRelative(46.293f, 46.293f, 0.0f, false, true, -1.527f, 7.0f)
                horizontalLineToRelative(9.473f)
                arcToRelative(46.688f, 46.688f, 0.0f, false, true, -1.526f, -7.0f)
                close()
                moveTo(21.0f, 20.0f)
                lineTo(14.974f, 20.0f)
                arcTo(4.948f, 4.948f, 0.0f, false, true, 16.0f, 23.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                lineTo(24.0f, 23.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 20.0f)
                close()
            }
        }
        .build()
        return _chess!!
    }

private var _chess: ImageVector? = null
