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

public val Icons.Filled.CowbellCirclePlus: ImageVector
    get() {
        if (_cowbellCirclePlus != null) {
            return _cowbellCirclePlus!!
        }
        _cowbellCirclePlus = Builder(name = "CowbellCirclePlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(8.0f, 17.0f)
                curveToRelative(0.0f, -4.963f, 4.038f, -9.0f, 9.0f, -9.0f)
                curveToRelative(1.339f, 0.0f, 2.611f, 0.295f, 3.755f, 0.822f)
                curveToRelative(-0.082f, -0.529f, -0.156f, -0.95f, -0.18f, -1.045f)
                curveToRelative(-0.562f, -2.181f, -2.51f, -3.712f, -4.755f, -3.75f)
                curveToRelative(0.117f, -0.32f, 0.181f, -0.666f, 0.181f, -1.026f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.36f, 0.064f, 0.706f, 0.181f, 1.027f)
                curveToRelative(-2.389f, 0.04f, -4.416f, 1.76f, -4.837f, 4.12f)
                lineTo(0.063f, 15.323f)
                curveToRelative(-0.208f, 1.169f, 0.109f, 2.361f, 0.871f, 3.271f)
                curveToRelative(0.762f, 0.91f, 1.88f, 1.432f, 3.067f, 1.432f)
                horizontalLineToRelative(2.999f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.122f, 0.0f, 0.243f, -0.006f, 0.362f, -0.016f)
                curveToRelative(-2.048f, -1.651f, -3.361f, -4.179f, -3.361f, -7.009f)
                close()
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.449f, -1.0f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _cowbellCirclePlus!!
    }

private var _cowbellCirclePlus: ImageVector? = null
