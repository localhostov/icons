package me.localx.icons.straight.outline

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

public val Icons.Outline.Restock: ImageVector
    get() {
        if (_restock != null) {
            return _restock!!
        }
        _restock = Builder(name = "Restock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-4.055f, 0.0f, -7.794f, -2.058f, -9.995f, -5.368f)
                lineToRelative(-0.005f, 2.368f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(-3.991f)
                curveToRelative(0.0f, -1.107f, 0.901f, -2.009f, 2.008f, -2.009f)
                horizontalLineToRelative(3.992f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.637f)
                curveToRelative(1.776f, 3.06f, 5.052f, 5.0f, 8.637f, 5.0f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                close()
                moveTo(22.0f, 3.0f)
                lineToRelative(-0.005f, 2.353f)
                curveTo(19.806f, 2.04f, 16.106f, 0.0f, 12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(3.64f, 0.0f, 6.9f, 1.921f, 8.666f, 5.0f)
                horizontalLineToRelative(-2.666f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.991f)
                curveToRelative(1.107f, 0.0f, 2.009f, -0.901f, 2.009f, -2.009f)
                verticalLineToRelative(-3.991f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(15.0f, 9.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(10.5f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _restock!!
    }

private var _restock: ImageVector? = null
