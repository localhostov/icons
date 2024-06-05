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

public val Icons.Bold.CoffeePot: ImageVector
    get() {
        if (_coffeePot != null) {
            return _coffeePot!!
        }
        _coffeePot = Builder(name = "CoffeePot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.052f, 3.0f)
                arcTo(25.728f, 25.728f, 0.0f, false, true, 21.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                arcTo(26.928f, 26.928f, 0.0f, false, false, 21.311f, 0.771f)
                lineTo(20.883f, 0.0f)
                horizontalLineTo(0.573f)
                lineTo(3.779f, 6.412f)
                arcTo(30.557f, 30.557f, 0.0f, false, false, 0.0f, 20.444f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 3.4f, 24.0f)
                horizontalLineTo(17.6f)
                arcTo(3.4f, 3.4f, 0.0f, false, false, 21.0f, 20.444f)
                curveToRelative(-0.383f, -8.076f, -3.1f, -12.976f, -4.0f, -14.395f)
                verticalLineTo(3.0f)
                close()
                moveTo(17.89f, 20.875f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 17.6f, 21.0f)
                horizontalLineTo(3.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.4f, -0.415f)
                arcTo(32.7f, 32.7f, 0.0f, false, true, 3.97f, 14.0f)
                horizontalLineTo(14.95f)
                arcToRelative(25.068f, 25.068f, 0.0f, false, false, -1.032f, -3.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, 1.4f, -3.0f)
                horizontalLineToRelative(8.347f)
                arcTo(28.009f, 28.009f, 0.0f, false, true, 18.0f, 20.585f)
                arcTo(0.4f, 0.4f, 0.0f, false, true, 17.89f, 20.875f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineTo(6.427f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _coffeePot!!
    }

private var _coffeePot: ImageVector? = null
