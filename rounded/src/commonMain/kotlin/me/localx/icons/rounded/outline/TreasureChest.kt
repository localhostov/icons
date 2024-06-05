package me.localx.icons.rounded.outline

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
                moveTo(17.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                curveTo(3.141f, 0.0f, 0.0f, 3.14f, 0.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -3.86f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 3.003f)
                curveToRelative(1.214f, 0.913f, 2.0f, 2.365f, 2.0f, 3.997f)
                close()
                moveTo(17.0f, 2.0f)
                curveToRelative(0.342f, 0.0f, 0.677f, 0.035f, 1.0f, 0.101f)
                verticalLineToRelative(6.899f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.0f, 2.101f)
                curveToRelative(0.323f, -0.066f, 0.658f, -0.101f, 1.0f, -0.101f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(11.0f, 9.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(4.0f, 3.003f)
                verticalLineToRelative(5.997f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.632f, 0.786f, -3.084f, 2.0f, -3.997f)
                close()
                moveTo(20.0f, 21.828f)
                verticalLineToRelative(-7.828f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 14.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.828f)
                curveToRelative(-1.164f, -0.413f, -2.0f, -1.524f, -2.0f, -2.828f)
                lineTo(2.0f, 11.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.304f, -0.836f, 2.415f, -2.0f, 2.828f)
                close()
            }
        }
        .build()
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
