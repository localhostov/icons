package me.localx.icons.straight.filled

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

public val Icons.Filled.TimeTwentyFour: ImageVector
    get() {
        if (_timeTwentyFour != null) {
            return _timeTwentyFour!!
        }
        _timeTwentyFour = Builder(name = "TimeTwentyFour", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.636f)
                arcToRelative(9.991f, 9.991f, 0.0f, true, false, -11.636f, 14.539f)
                verticalLineToRelative(2.066f)
                arcToRelative(11.993f, 11.993f, 0.0f, true, true, 13.0f, -18.231f)
                verticalLineToRelative(-2.374f)
                close()
                moveTo(17.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 0.5f, -0.85f, 1.138f, -1.6f, 1.7f)
                curveToRelative(-1.125f, 0.844f, -2.4f, 1.8f, -2.4f, 3.3f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(0.271f, -0.236f, 0.589f, -0.474f, 0.89f, -0.7f)
                curveToRelative(1.125f, -0.844f, 2.4f, -1.8f, 2.4f, -3.3f)
                close()
                moveTo(22.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _timeTwentyFour!!
    }

private var _timeTwentyFour: ImageVector? = null
