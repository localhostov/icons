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

public val Icons.Bold.UniformMartialArts: ImageVector
    get() {
        if (_uniformMartialArts != null) {
            return _uniformMartialArts!!
        }
        _uniformMartialArts = Builder(name = "UniformMartialArts", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.797f)
                curveToRelative(0.0f, -1.404f, -0.641f, -2.705f, -1.758f, -3.57f)
                curveToRelative(-1.312f, -1.016f, -3.462f, -2.227f, -6.242f, -2.227f)
                lineTo(8.0f, 0.0f)
                curveTo(5.22f, 0.0f, 3.07f, 1.211f, 1.758f, 2.227f)
                curveToRelative(-1.117f, 0.865f, -1.758f, 2.166f, -1.758f, 3.57f)
                verticalLineToRelative(15.203f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(24.0f, 5.797f)
                close()
                moveTo(3.0f, 18.0f)
                lineTo(3.0f, 5.797f)
                curveToRelative(0.0f, -0.469f, 0.217f, -0.905f, 0.594f, -1.197f)
                curveToRelative(0.943f, -0.729f, 2.473f, -1.6f, 4.406f, -1.6f)
                horizontalLineToRelative(0.857f)
                lineToRelative(2.013f, 3.523f)
                lineToRelative(-2.87f, 4.975f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(11.0f)
                lineTo(3.0f, 18.0f)
                close()
                moveTo(8.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.235f)
                curveToRelative(-0.122f, 0.894f, -0.235f, 1.996f, -0.235f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, -1.004f, -0.113f, -2.106f, -0.235f, -3.0f)
                horizontalLineToRelative(2.235f)
                verticalLineToRelative(5.0f)
                lineTo(8.0f, 21.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-5.403f)
                lineTo(16.36f, 3.01f)
                curveToRelative(1.763f, 0.099f, 3.162f, 0.906f, 4.046f, 1.589f)
                curveToRelative(0.377f, 0.292f, 0.594f, 0.729f, 0.594f, 1.197f)
                verticalLineToRelative(12.203f)
                close()
            }
        }
        .build()
        return _uniformMartialArts!!
    }

private var _uniformMartialArts: ImageVector? = null
