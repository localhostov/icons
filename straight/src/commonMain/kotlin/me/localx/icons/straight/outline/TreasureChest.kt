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

public val Icons.Outline.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) {
            return _treasureChest!!
        }
        _treasureChest = Builder(name = "TreasureChest", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                curveTo(2.691f, 0.0f, 0.0f, 2.691f, 0.0f, 6.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 2.556f)
                curveToRelative(1.19f, 0.694f, 2.0f, 1.97f, 2.0f, 3.444f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(13.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                close()
                moveTo(4.0f, 2.556f)
                verticalLineToRelative(6.444f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.474f, 0.81f, -2.75f, 2.0f, -3.444f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(20.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 11.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
