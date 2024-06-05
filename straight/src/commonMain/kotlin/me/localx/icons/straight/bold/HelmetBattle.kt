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

public val Icons.Bold.HelmetBattle: ImageVector
    get() {
        if (_helmetBattle != null) {
            return _helmetBattle!!
        }
        _helmetBattle = Builder(name = "HelmetBattle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.723f, 0.417f)
                lineToRelative(-0.723f, -0.397f)
                lineToRelative(-0.723f, 0.397f)
                curveToRelative(-0.949f, 0.522f, -9.277f, 5.256f, -9.277f, 10.682f)
                verticalLineToRelative(8.791f)
                lineToRelative(10.0f, 4.118f)
                lineToRelative(10.0f, -4.118f)
                verticalLineToRelative(-8.791f)
                curveTo(22.0f, 5.673f, 13.672f, 0.938f, 12.723f, 0.417f)
                close()
                moveTo(19.0f, 17.881f)
                lineToRelative(-5.5f, 2.265f)
                verticalLineToRelative(-5.395f)
                lineToRelative(3.5f, -1.75f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 10.001f)
                verticalLineToRelative(3.0f)
                lineToRelative(3.5f, 1.75f)
                verticalLineToRelative(5.395f)
                lineToRelative(-5.5f, -2.265f)
                verticalLineToRelative(-6.782f)
                curveToRelative(0.0f, -2.551f, 4.031f, -5.848f, 7.0f, -7.635f)
                curveToRelative(2.969f, 1.788f, 7.0f, 5.084f, 7.0f, 7.635f)
                verticalLineToRelative(6.782f)
                close()
            }
        }
        .build()
        return _helmetBattle!!
    }

private var _helmetBattle: ImageVector? = null
