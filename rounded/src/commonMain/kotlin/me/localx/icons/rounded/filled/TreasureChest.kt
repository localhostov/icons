package me.localx.icons.rounded.filled

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

public val Icons.Filled.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) {
            return _treasureChest!!
        }
        _treasureChest = Builder(name = "TreasureChest", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.072f)
                curveToRelative(0.327f, -0.047f, 0.661f, -0.072f, 1.0f, -0.072f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.339f, 0.0f, 0.673f, 0.025f, 1.0f, 0.072f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.0f, 0.072f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.787f, -1.637f, -5.198f, -4.0f, -6.324f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.435f, 4.0f, 4.899f)
                lineTo(4.0f, 14.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 14.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(9.899f)
                curveToRelative(2.279f, -0.465f, 4.0f, -2.485f, 4.0f, -4.899f)
                lineTo(24.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(4.0f, 0.676f)
                curveTo(1.637f, 1.802f, 0.0f, 4.213f, 0.0f, 7.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.551f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
