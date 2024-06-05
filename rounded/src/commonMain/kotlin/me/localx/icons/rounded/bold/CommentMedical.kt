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

public val Icons.Bold.CommentMedical: ImageVector
    get() {
        if (_commentMedical != null) {
            return _commentMedical!!
        }
        _commentMedical = Builder(name = "CommentMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.853f, 0.029f)
                curveToRelative(-3.481f, -0.238f, -6.882f, 1.03f, -9.338f, 3.485f)
                curveTo(1.059f, 5.971f, -0.211f, 9.375f, 0.029f, 12.853f)
                curveToRelative(0.441f, 6.354f, 6.044f, 11.147f, 13.033f, 11.147f)
                horizontalLineToRelative(5.62f)
                curveToRelative(3.081f, 0.0f, 5.317f, -2.577f, 5.317f, -6.127f)
                verticalLineToRelative(-5.551f)
                curveTo(24.0f, 5.863f, 19.104f, 0.463f, 12.853f, 0.029f)
                close()
                moveTo(21.0f, 17.873f)
                curveToRelative(0.0f, 1.899f, -0.91f, 3.127f, -2.317f, 3.127f)
                horizontalLineToRelative(-5.62f)
                curveToRelative(-5.482f, 0.0f, -9.705f, -3.514f, -10.04f, -8.354f)
                curveToRelative(-0.181f, -2.612f, 0.771f, -5.167f, 2.614f, -7.009f)
                curveToRelative(1.694f, -1.694f, 3.99f, -2.636f, 6.379f, -2.636f)
                curveToRelative(0.209f, 0.0f, 0.419f, 0.007f, 0.629f, 0.022f)
                curveToRelative(4.685f, 0.325f, 8.355f, 4.41f, 8.355f, 9.3f)
                verticalLineToRelative(5.551f)
                close()
                moveTo(17.0f, 12.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _commentMedical!!
    }

private var _commentMedical: ImageVector? = null
