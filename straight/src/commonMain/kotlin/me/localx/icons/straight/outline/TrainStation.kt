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

public val Icons.Outline.TrainStation: ImageVector
    get() {
        if (_trainStation != null) {
            return _trainStation!!
        }
        _trainStation = Builder(name = "TrainStation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(17.5f, 9.0f)
                horizontalLineToRelative(4.414f)
                curveToRelative(0.055f, 0.156f, 0.086f, 0.325f, 0.086f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(11.086f, 9.0f)
                horizontalLineToRelative(4.414f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.175f, 0.031f, -0.344f, 0.086f, -0.5f)
                close()
                moveTo(19.5f, 22.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 18.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(13.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 18.0f)
                close()
                moveTo(4.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _trainStation!!
    }

private var _trainStation: ImageVector? = null
