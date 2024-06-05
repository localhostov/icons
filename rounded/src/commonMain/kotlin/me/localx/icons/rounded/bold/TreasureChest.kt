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

public val Icons.Bold.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) {
            return _treasureChest!!
        }
        _treasureChest = Builder(name = "TreasureChest", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 0.0f)
                lineTo(7.5f, 0.0f)
                curveTo(3.364f, 0.0f, 0.0f, 3.364f, 0.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 7.5f)
                curveToRelative(0.0f, -4.136f, -3.364f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(21.0f, 7.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 3.76f)
                curveToRelative(1.205f, 0.808f, 2.0f, 2.183f, 2.0f, 3.74f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(5.0f, 3.76f)
                verticalLineToRelative(5.24f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.557f, 0.795f, -2.932f, 2.0f, -3.74f)
                close()
                moveTo(19.0f, 20.95f)
                verticalLineToRelative(-5.45f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(5.45f)
                curveToRelative(-1.14f, -0.232f, -2.0f, -1.242f, -2.0f, -2.45f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.207f, -0.86f, 2.217f, -2.0f, 2.45f)
                close()
            }
        }
        .build()
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
