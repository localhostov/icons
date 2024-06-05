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

public val Icons.Bold.ArrowsSplitRightAndLeft: ImageVector
    get() {
        if (_arrowsSplitRightAndLeft != null) {
            return _arrowsSplitRightAndLeft!!
        }
        _arrowsSplitRightAndLeft = Builder(name = "ArrowsSplitRightAndLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.649f, 6.349f)
                lineToRelative(-3.6f, 3.796f)
                curveToRelative(-0.756f, 0.756f, -2.049f, 0.221f, -2.049f, -0.849f)
                verticalLineToRelative(-2.296f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineTo(9.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.296f)
                curveToRelative(0.0f, 1.069f, -1.293f, 1.604f, -2.049f, 0.849f)
                lineTo(0.351f, 6.349f)
                curveToRelative(-0.469f, -0.469f, -0.469f, -1.228f, 0.0f, -1.697f)
                lineTo(3.951f, 0.855f)
                curveToRelative(0.756f, -0.756f, 2.049f, -0.221f, 2.049f, 0.849f)
                verticalLineToRelative(2.296f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.577f, 0.0f, 2.996f, 0.671f, 4.0f, 1.737f)
                curveToRelative(1.004f, -1.066f, 2.423f, -1.737f, 4.0f, -1.737f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(1.704f)
                curveToRelative(0.0f, -1.069f, 1.293f, -1.604f, 2.049f, -0.849f)
                lineToRelative(3.6f, 3.796f)
                curveToRelative(0.469f, 0.469f, 0.469f, 1.228f, 0.0f, 1.697f)
                close()
            }
        }
        .build()
        return _arrowsSplitRightAndLeft!!
    }

private var _arrowsSplitRightAndLeft: ImageVector? = null
