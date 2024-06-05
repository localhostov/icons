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

public val Icons.Bold.Revenue: ImageVector
    get() {
        if (_revenue != null) {
            return _revenue!!
        }
        _revenue = Builder(name = "Revenue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(10.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(18.0f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.58f, -1.059f, -2.903f, -2.5f, -3.337f)
                verticalLineToRelative(-1.163f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.163f)
                curveToRelative(-1.441f, 0.434f, -2.5f, 1.757f, -2.5f, 3.337f)
                curveToRelative(0.0f, 1.528f, 0.917f, 2.882f, 2.336f, 3.45f)
                lineToRelative(2.214f, 0.886f)
                curveToRelative(0.273f, 0.109f, 0.45f, 0.37f, 0.45f, 0.665f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.58f, 1.059f, 2.903f, 2.5f, 3.337f)
                verticalLineToRelative(1.163f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.163f)
                curveToRelative(1.441f, -0.434f, 2.5f, -1.757f, 2.5f, -3.337f)
                curveToRelative(0.0f, -1.528f, -0.917f, -2.882f, -2.336f, -3.45f)
                lineToRelative(-2.214f, -0.886f)
                curveToRelative(-0.273f, -0.109f, -0.45f, -0.37f, -0.45f, -0.665f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.348f)
                curveToRelative(0.717f, -1.021f, 1.5f, -1.925f, 3.0f, -2.579f)
                lineTo(18.0f, 3.0f)
                close()
                moveTo(23.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(23.0f, 0.0f)
                close()
            }
        }
        .build()
        return _revenue!!
    }

private var _revenue: ImageVector? = null
