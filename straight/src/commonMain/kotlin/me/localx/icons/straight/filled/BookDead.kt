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

public val Icons.Filled.BookDead: ImageVector
    get() {
        if (_bookDead != null) {
            return _bookDead!!
        }
        _bookDead = Builder(name = "BookDead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(9.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(16.0f)
                lineTo(4.0f, 18.0f)
                curveToRelative(-0.738f, -0.001f, -1.451f, 0.271f, -2.0f, 0.765f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(16.444f, 8.444f)
                curveToRelative(0.0f, -2.451f, -1.993f, -4.444f, -4.444f, -4.444f)
                reflectiveCurveToRelative(-4.444f, 1.994f, -4.444f, 4.444f)
                lineToRelative(-0.056f, 3.556f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.389f)
                reflectiveCurveToRelative(0.056f, -2.256f, 0.056f, -3.556f)
                close()
            }
        }
        .build()
        return _bookDead!!
    }

private var _bookDead: ImageVector? = null
