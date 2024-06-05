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

public val Icons.Bold.Prescription: ImageVector
    get() {
        if (_prescription != null) {
            return _prescription!!
        }
        _prescription = Builder(name = "Prescription", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.303f, 18.0f)
                lineToRelative(2.445f, -3.668f)
                curveToRelative(0.459f, -0.689f, 0.273f, -1.62f, -0.416f, -2.08f)
                curveToRelative(-0.691f, -0.462f, -1.621f, -0.273f, -2.08f, 0.416f)
                lineToRelative(-1.752f, 2.628f)
                lineToRelative(-1.789f, -2.683f)
                curveToRelative(2.499f, -0.907f, 4.289f, -3.305f, 4.289f, -6.113f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-4.004f)
                curveTo(5.463f, 0.0f, 2.996f, 2.468f, 2.996f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(5.368f)
                lineToRelative(3.333f, 5.0f)
                lineToRelative(-2.445f, 3.668f)
                curveToRelative(-0.459f, 0.689f, -0.273f, 1.62f, 0.416f, 2.08f)
                curveToRelative(0.256f, 0.171f, 0.545f, 0.252f, 0.831f, 0.252f)
                curveToRelative(0.485f, 0.0f, 0.96f, -0.234f, 1.25f, -0.668f)
                lineToRelative(1.752f, -2.628f)
                lineToRelative(1.752f, 2.628f)
                curveToRelative(0.289f, 0.434f, 0.765f, 0.668f, 1.25f, 0.668f)
                curveToRelative(0.286f, 0.0f, 0.575f, -0.081f, 0.831f, -0.252f)
                curveToRelative(0.689f, -0.46f, 0.875f, -1.391f, 0.416f, -2.08f)
                lineToRelative(-2.445f, -3.668f)
                close()
                moveTo(5.996f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.004f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.504f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }
        .build()
        return _prescription!!
    }

private var _prescription: ImageVector? = null
