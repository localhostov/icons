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

public val Icons.Filled.BookCopy: ImageVector
    get() {
        if (_bookCopy != null) {
            return _bookCopy!!
        }
        _bookCopy = Builder(name = "BookCopy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                reflectiveCurveToRelative(0.0f, 4.0f, 0.0f, 4.0f)
                lineTo(2.0f, 24.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(14.0f)
                reflectiveCurveToRelative(0.0f, 4.0f, 0.0f, 4.0f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(11.0f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                reflectiveCurveToRelative(-14.0f, 0.0f, -14.0f, 0.0f)
                curveToRelative(-0.738f, -0.001f, -1.451f, 0.271f, -2.0f, 0.765f)
                lineTo(8.0f, 3.0f)
                curveTo(8.0f, 1.343f, 9.343f, 0.0f, 11.0f, 0.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(1.343f, 6.0f, 0.0f, 7.343f, 0.0f, 9.0f)
                verticalLineToRelative(9.765f)
                curveToRelative(0.549f, -0.494f, 1.262f, -0.766f, 2.0f, -0.765f)
                horizontalLineToRelative(4.535f)
                curveToRelative(-0.34f, -0.588f, -0.535f, -1.271f, -0.535f, -2.0f)
                close()
            }
        }
        .build()
        return _bookCopy!!
    }

private var _bookCopy: ImageVector? = null
