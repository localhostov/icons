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

public val Icons.Bold.ChessPawnAlt: ImageVector
    get() {
        if (_chessPawnAlt != null) {
            return _chessPawnAlt!!
        }
        _chessPawnAlt = Builder(name = "ChessPawnAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                lineTo(19.0f, 20.0f)
                curveToRelative(-0.975f, 0.0f, -2.736f, -3.427f, -2.973f, -10.0f)
                lineTo(16.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.081f, -3.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, false, 7.419f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 10.0f)
                horizontalLineToRelative(0.473f)
                curveToRelative(-0.237f, 6.573f, -2.0f, 10.0f, -2.973f, 10.0f)
                lineTo(4.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                lineTo(20.0f, 24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(10.974f, 10.0f)
                horizontalLineToRelative(2.052f)
                curveToRelative(0.129f, 3.664f, 0.742f, 7.462f, 2.038f, 10.0f)
                lineTo(8.936f, 20.0f)
                curveTo(10.232f, 17.462f, 10.845f, 13.664f, 10.974f, 10.0f)
                close()
            }
        }
        .build()
        return _chessPawnAlt!!
    }

private var _chessPawnAlt: ImageVector? = null
