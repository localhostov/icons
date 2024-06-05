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

public val Icons.Outline.CircleExclamationCheck: ImageVector
    get() {
        if (_circleExclamationCheck != null) {
            return _circleExclamationCheck!!
        }
        _circleExclamationCheck = Builder(name = "CircleExclamationCheck", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.456f, 10.282f)
                lineToRelative(-1.393f, 1.436f)
                lineToRelative(2.782f, 2.696f)
                curveToRelative(0.391f, 0.391f, 0.903f, 0.586f, 1.416f, 0.586f)
                reflectiveCurveToRelative(1.021f, -0.194f, 1.406f, -0.58f)
                lineToRelative(5.293f, -5.207f)
                lineToRelative(-1.402f, -1.426f)
                lineToRelative(-5.31f, 5.202f)
                lineToRelative(-2.793f, -2.707f)
                close()
                moveTo(16.326f, 16.878f)
                curveToRelative(-1.464f, 1.894f, -3.752f, 3.122f, -6.326f, 3.122f)
                curveToRelative(-4.411f, 0.0f, -8.0f, -3.589f, -8.0f, -8.0f)
                reflectiveCurveTo(5.589f, 4.0f, 10.0f, 4.0f)
                curveToRelative(3.636f, 0.0f, 6.708f, 2.441f, 7.677f, 5.769f)
                lineToRelative(1.577f, -1.545f)
                curveToRelative(-1.493f, -3.647f, -5.077f, -6.224f, -9.254f, -6.224f)
                curveTo(4.486f, 2.0f, 0.0f, 6.486f, 0.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                curveToRelative(3.824f, 0.0f, 7.151f, -2.16f, 8.832f, -5.323f)
                curveToRelative(-0.489f, 0.208f, -1.02f, 0.323f, -1.571f, 0.323f)
                curveToRelative(-0.321f, 0.0f, -0.632f, -0.049f, -0.936f, -0.122f)
                close()
            }
        }
        .build()
        return _circleExclamationCheck!!
    }

private var _circleExclamationCheck: ImageVector? = null
