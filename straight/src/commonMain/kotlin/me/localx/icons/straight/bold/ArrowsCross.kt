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

public val Icons.Bold.ArrowsCross: ImageVector
    get() {
        if (_arrowsCross != null) {
            return _arrowsCross!!
        }
        _arrowsCross = Builder(name = "ArrowsCross", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.465f, 10.585f)
                lineTo(0.04f, 2.162f)
                lineTo(2.161f, 0.041f)
                lineTo(10.586f, 8.464f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(21.0f, 18.878f)
                lineToRelative(-5.474f, -5.474f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(5.474f, 5.474f)
                horizontalLineToRelative(-3.879f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.879f)
                close()
                moveTo(21.5f, 0.0f)
                horizontalLineToRelative(-6.5f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(3.879f)
                lineTo(0.04f, 21.838f)
                lineToRelative(2.121f, 2.121f)
                lineTo(21.0f, 5.121f)
                verticalLineToRelative(3.879f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 2.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _arrowsCross!!
    }

private var _arrowsCross: ImageVector? = null
