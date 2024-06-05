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

public val Icons.Outline.MountainCity: ImageVector
    get() {
        if (_mountainCity != null) {
            return _mountainCity!!
        }
        _mountainCity = Builder(name = "MountainCity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.074f)
                lineToRelative(0.504f, 0.926f)
                horizontalLineToRelative(1.496f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(0.361f)
                lineToRelative(2.0f, 3.678f)
                lineTo(12.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(14.0f, 10.717f)
                lineToRelative(0.154f, 0.283f)
                horizontalLineToRelative(1.846f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.717f)
                close()
                moveTo(9.0f, 5.709f)
                lineToRelative(9.0f, 16.552f)
                verticalLineToRelative(1.739f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-1.739f)
                lineTo(9.0f, 5.709f)
                close()
                moveTo(9.0f, 9.896f)
                lineToRelative(-2.323f, 4.273f)
                lineToRelative(0.826f, 1.384f)
                lineToRelative(1.498f, -2.496f)
                lineToRelative(1.515f, 2.526f)
                lineToRelative(0.841f, -1.353f)
                lineToRelative(-2.357f, -4.334f)
                close()
                moveTo(15.582f, 22.0f)
                lineToRelative(-3.127f, -5.75f)
                lineToRelative(-1.97f, 3.168f)
                lineToRelative(-1.485f, -2.474f)
                lineToRelative(-1.502f, 2.504f)
                lineToRelative(-1.931f, -3.237f)
                lineToRelative(-3.148f, 5.789f)
                horizontalLineToRelative(13.164f)
                close()
            }
        }
        .build()
        return _mountainCity!!
    }

private var _mountainCity: ImageVector? = null
