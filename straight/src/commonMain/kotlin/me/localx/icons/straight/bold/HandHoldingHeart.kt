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

public val Icons.Bold.HandHoldingHeart: ImageVector
    get() {
        if (_handHoldingHeart != null) {
            return _handHoldingHeart!!
        }
        _handHoldingHeart = Builder(name = "HandHoldingHeart", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.732f, 9.013f)
                arcToRelative(3.882f, 3.882f, 0.0f, false, false, -5.487f, 0.257f)
                lineToRelative(-2.438f, 2.679f)
                arcTo(3.629f, 3.629f, 0.0f, false, false, 12.357f, 11.0f)
                lineTo(3.5f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 14.5f)
                verticalLineToRelative(6.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.5f, 24.0f)
                lineTo(14.681f, 24.0f)
                lineToRelative(8.334f, -9.532f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 22.732f, 9.013f)
                close()
                moveTo(20.767f, 12.482f)
                lineTo(13.319f, 21.0f)
                lineTo(3.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(8.857f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, true, 0.092f, 1.278f)
                lineToRelative(-5.161f, 0.737f)
                lineToRelative(0.424f, 2.97f)
                lineToRelative(5.162f, -0.737f)
                arcToRelative(3.665f, 3.665f, 0.0f, false, false, 3.093f, -3.116f)
                lineToRelative(3.5f, -3.843f)
                arcToRelative(0.883f, 0.883f, 0.0f, false, true, 1.248f, -0.059f)
                arcTo(0.89f, 0.89f, 0.0f, false, true, 20.767f, 12.482f)
                close()
                moveTo(7.0f, 2.475f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 9.25f, 0.0f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 11.5f, 2.475f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 13.75f, 0.0f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 16.0f, 2.475f)
                curveToRelative(0.0f, 2.592f, -4.5f, 5.775f, -4.5f, 5.775f)
                reflectiveCurveTo(7.0f, 5.067f, 7.0f, 2.475f)
                close()
            }
        }
        .build()
        return _handHoldingHeart!!
    }

private var _handHoldingHeart: ImageVector? = null
