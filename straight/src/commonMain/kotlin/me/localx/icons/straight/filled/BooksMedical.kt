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

public val Icons.Filled.BooksMedical: ImageVector
    get() {
        if (_booksMedical != null) {
            return _booksMedical!!
        }
        _booksMedical = Builder(name = "BooksMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(3.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(3.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineToRelative(5.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(10.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(20.661f, 6.166f)
                lineToRelative(-4.928f, 0.848f)
                lineToRelative(1.789f, 10.443f)
                lineToRelative(4.928f, -0.848f)
                lineToRelative(-1.789f, -10.443f)
                close()
                moveTo(22.79f, 18.58f)
                lineToRelative(-4.928f, 0.848f)
                lineToRelative(0.764f, 4.586f)
                lineToRelative(4.928f, -0.848f)
                lineToRelative(-0.764f, -4.586f)
                close()
                moveTo(19.887f, 1.689f)
                curveToRelative(-0.188f, -1.088f, -1.222f, -1.819f, -2.31f, -1.631f)
                lineToRelative(-0.985f, 0.17f)
                curveToRelative(-0.829f, 0.143f, -1.448f, 0.779f, -1.614f, 1.555f)
                curveToRelative(-0.11f, -1.001f, -0.948f, -1.782f, -1.978f, -1.782f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.233f)
                lineToRelative(0.393f, 2.277f)
                lineToRelative(4.927f, -0.847f)
                lineToRelative(-0.433f, -2.508f)
                close()
                moveTo(15.392f, 5.044f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _booksMedical!!
    }

private var _booksMedical: ImageVector? = null
