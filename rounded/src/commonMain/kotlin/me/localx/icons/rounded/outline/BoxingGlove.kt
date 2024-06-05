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

public val Icons.Outline.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) {
            return _boxingGlove!!
        }
        _boxingGlove = Builder(name = "BoxingGlove", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.126f)
                lineTo(20.0f, 7.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, -7.0f, -7.0f)
                lineTo(8.0f, 0.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, false, 1.0f, 7.0f)
                verticalLineToRelative(6.868f)
                arcToRelative(7.958f, 7.958f, 0.0f, false, false, 1.45f, 4.593f)
                lineToRelative(0.55f, 0.785f)
                lineTo(3.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-0.641f)
                lineToRelative(0.513f, -0.487f)
                arcTo(8.033f, 8.033f, 0.0f, false, false, 23.0f, 13.075f)
                lineTo(23.0f, 11.0f)
                arcTo(4.008f, 4.008f, 0.0f, false, false, 20.0f, 7.126f)
                close()
                moveTo(16.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(18.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 22.0f)
                close()
                moveTo(21.0f, 13.075f)
                arcToRelative(6.027f, 6.027f, 0.0f, false, true, -1.866f, 4.348f)
                lineTo(18.527f, 18.0f)
                lineTo(4.569f, 18.0f)
                lineToRelative(-0.482f, -0.687f)
                arcTo(5.975f, 5.975f, 0.0f, false, true, 3.0f, 13.868f)
                lineTo(3.0f, 10.463f)
                arcTo(3.98f, 3.98f, 0.0f, false, false, 5.0f, 11.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(5.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 8.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(0.126f)
                arcTo(4.008f, 4.008f, 0.0f, false, false, 15.0f, 11.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(17.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
