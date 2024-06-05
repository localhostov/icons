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

public val Icons.Bold.GlassWhiskey: ImageVector
    get() {
        if (_glassWhiskey != null) {
            return _glassWhiskey!!
        }
        _glassWhiskey = Builder(name = "GlassWhiskey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(-0.003f, 1.0f)
                lineToRelative(1.71f, 18.817f)
                curveToRelative(0.165f, 1.815f, 1.664f, 3.183f, 3.486f, 3.183f)
                horizontalLineToRelative(13.491f)
                curveToRelative(1.812f, 0.0f, 3.309f, -1.359f, 3.484f, -3.162f)
                lineToRelative(1.829f, -18.838f)
                lineTo(-0.003f, 1.0f)
                close()
                moveTo(20.693f, 4.0f)
                lineToRelative(-0.874f, 9.0f)
                lineTo(4.1f, 13.0f)
                lineToRelative(-0.818f, -9.0f)
                horizontalLineToRelative(17.411f)
                close()
                moveTo(18.684f, 20.0f)
                lineTo(5.193f, 20.0f)
                curveToRelative(-0.261f, 0.0f, -0.475f, -0.195f, -0.498f, -0.455f)
                lineToRelative(-0.322f, -3.545f)
                horizontalLineToRelative(15.154f)
                lineToRelative(-0.345f, 3.548f)
                curveToRelative(-0.024f, 0.257f, -0.239f, 0.452f, -0.498f, 0.452f)
                close()
            }
        }
        .build()
        return _glassWhiskey!!
    }

private var _glassWhiskey: ImageVector? = null
