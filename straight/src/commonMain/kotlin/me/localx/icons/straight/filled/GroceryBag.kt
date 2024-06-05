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

public val Icons.Filled.GroceryBag: ImageVector
    get() {
        if (_groceryBag != null) {
            return _groceryBag!!
        }
        _groceryBag = Builder(name = "GroceryBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.315f, 11.896f)
                lineToRelative(3.685f, -1.896f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-9.906f)
                lineToRelative(1.513f, -0.94f)
                lineToRelative(2.803f, 1.742f)
                close()
                moveTo(14.0f, 11.397f)
                lineToRelative(-2.0f, -1.242f)
                lineToRelative(-2.757f, 1.712f)
                lineToRelative(-2.756f, -1.713f)
                lineToRelative(-2.803f, 1.742f)
                lineToRelative(-3.685f, -1.896f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.026f)
                curveToRelative(-0.635f, -0.838f, -1.026f, -1.87f, -1.026f, -3.0f)
                verticalLineToRelative(-9.603f)
                close()
                moveTo(6.487f, 7.8f)
                lineToRelative(2.756f, 1.713f)
                lineToRelative(2.757f, -1.712f)
                lineToRelative(0.814f, 0.506f)
                curveToRelative(-0.113f, -0.519f, -0.276f, -1.028f, -0.494f, -1.52f)
                lineToRelative(-0.896f, -2.033f)
                curveToRelative(-0.282f, -0.64f, -0.425f, -1.318f, -0.425f, -2.017f)
                verticalLineToRelative(-0.736f)
                horizontalLineToRelative(1.0f)
                lineTo(11.999f, 0.0f)
                lineTo(3.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.736f)
                curveToRelative(0.0f, 0.698f, -0.143f, 1.377f, -0.425f, 2.017f)
                lineToRelative(-0.896f, 2.033f)
                curveToRelative(-0.29f, 0.657f, -0.478f, 1.342f, -0.582f, 2.044f)
                lineToRelative(1.494f, 0.769f)
                lineToRelative(2.896f, -1.8f)
                close()
                moveTo(20.408f, 9.6f)
                lineToRelative(1.542f, -0.794f)
                curveToRelative(0.02f, -0.185f, 0.049f, -0.368f, 0.049f, -0.556f)
                curveToRelative(0.0f, -1.271f, -0.472f, -2.423f, -1.227f, -3.332f)
                curveToRelative(1.951f, -0.38f, 2.877f, -2.128f, 3.1f, -3.108f)
                lineToRelative(0.127f, -0.558f)
                lineToRelative(-0.568f, -0.065f)
                curveToRelative(-0.336f, -0.039f, -0.658f, -0.058f, -0.965f, -0.058f)
                curveToRelative(-1.224f, 0.0f, -2.22f, 0.305f, -2.971f, 0.911f)
                curveToRelative(-0.507f, 0.409f, -0.804f, 0.884f, -0.984f, 1.287f)
                curveToRelative(-0.553f, -0.199f, -1.141f, -0.326f, -1.762f, -0.326f)
                curveToRelative(-1.286f, 0.0f, -2.449f, 0.482f, -3.36f, 1.254f)
                lineToRelative(0.76f, 1.726f)
                curveToRelative(0.267f, 0.604f, 0.475f, 1.244f, 0.618f, 1.901f)
                lineToRelative(0.312f, 1.431f)
                lineToRelative(2.432f, -1.512f)
                lineToRelative(2.896f, 1.8f)
                close()
            }
        }
        .build()
        return _groceryBag!!
    }

private var _groceryBag: ImageVector? = null
