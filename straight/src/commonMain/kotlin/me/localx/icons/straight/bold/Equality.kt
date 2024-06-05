package me.localx.icons.straight.bold

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

public val Icons.Bold.Equality: ImageVector
    get() {
        if (_equality != null) {
            return _equality!!
        }
        _equality = Builder(name = "Equality", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.743f)
                lineToRelative(-3.438f, -9.743f)
                horizontalLineToRelative(-7.062f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.0f)
                lineTo(3.438f, 2.0f)
                lineTo(0.0f, 11.743f)
                verticalLineToRelative(0.757f)
                curveToRelative(0.0f, 2.485f, 2.014f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.757f)
                lineToRelative(-2.38f, -6.743f)
                horizontalLineToRelative(3.88f)
                lineTo(10.5f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(20.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.5f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(3.88f)
                lineToRelative(-2.38f, 6.743f)
                verticalLineToRelative(0.757f)
                curveToRelative(0.0f, 2.485f, 2.014f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.757f)
                close()
                moveTo(3.091f, 12.0f)
                lineToRelative(1.409f, -3.993f)
                lineToRelative(1.409f, 3.993f)
                lineTo(3.091f, 12.0f)
                close()
                moveTo(18.091f, 12.0f)
                lineToRelative(1.409f, -3.993f)
                lineToRelative(1.409f, 3.993f)
                horizontalLineToRelative(-2.819f)
                close()
            }
        }
        .build()
        return _equality!!
    }

private var _equality: ImageVector? = null
