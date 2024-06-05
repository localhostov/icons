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

public val Icons.Filled.Burrito: ImageVector
    get() {
        if (_burrito != null) {
            return _burrito!!
        }
        _burrito = Builder(name = "Burrito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(17.0f, 24.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.913f, -2.313f)
                curveTo(18.867f, 12.984f, 7.676f, 8.0f, 4.0f, 8.0f)
                close()
                moveTo(8.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 21.0f)
                close()
                moveTo(10.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 18.0f)
                close()
                moveTo(12.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 21.0f)
                close()
                moveTo(14.333f, 10.1f)
                arcTo(10.152f, 10.152f, 0.0f, false, true, 20.0f, 8.0f)
                verticalLineToRelative(8.062f)
                arcTo(20.5f, 20.5f, 0.0f, false, false, 14.333f, 10.1f)
                close()
                moveTo(21.0f, 4.0f)
                arcToRelative(3.792f, 3.792f, 0.0f, false, true, -0.616f, 2.0f)
                lineTo(20.0f, 6.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -6.883f, 2.513f)
                lineToRelative(-0.593f, 0.454f)
                curveTo(11.81f, 8.549f, 11.1f, 8.183f, 10.4f, 7.853f)
                arcTo(9.24f, 9.24f, 0.0f, false, true, 12.544f, 5.71f)
                lineTo(11.456f, 4.031f)
                arcTo(11.97f, 11.97f, 0.0f, false, false, 8.5f, 7.048f)
                arcTo(14.138f, 14.138f, 0.0f, false, false, 4.0f, 6.0f)
                lineTo(3.623f, 6.0f)
                arcTo(3.738f, 3.738f, 0.0f, false, true, 3.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.137f, 1.224f)
                arcTo(4.07f, 4.07f, 0.0f, false, true, 12.0f, 0.545f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, 4.863f, 0.679f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 4.0f)
                close()
            }
        }
        .build()
        return _burrito!!
    }

private var _burrito: ImageVector? = null
