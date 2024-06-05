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

public val Icons.Outline.Compliance: ImageVector
    get() {
        if (_compliance != null) {
            return _compliance!!
        }
        _compliance = Builder(name = "Compliance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.396f, 10.735f)
                curveToRelative(0.057f, -0.334f, 0.029f, -0.519f, 0.007f, -0.599f)
                curveToRelative(-0.188f, -0.69f, -0.75f, -1.136f, -1.432f, -1.136f)
                curveToRelative(-0.213f, 0.0f, -0.428f, 0.044f, -0.64f, 0.132f)
                curveToRelative(-0.254f, 0.105f, -0.503f, 0.367f, -0.682f, 0.719f)
                lineToRelative(-2.193f, 4.149f)
                horizontalLineToRelative(-2.456f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.5f)
                lineToRelative(1.5f, -8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.184f)
                lineToRelative(0.58f, -3.265f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(13.965f, 16.0f)
                lineToRelative(-1.125f, 6.0f)
                horizontalLineToRelative(-6.84f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(7.965f)
                close()
                moveTo(15.0f, 6.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(15.0f, 11.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.791f, 12.662f)
                lineToRelative(1.748f, 1.119f)
                lineToRelative(-1.078f, 1.684f)
                lineToRelative(-1.754f, -1.123f)
                curveToRelative(-0.733f, 0.861f, -1.657f, 1.557f, -2.707f, 2.021f)
                verticalLineToRelative(-2.282f)
                curveToRelative(1.5f, -0.99f, 2.5f, -2.677f, 2.5f, -4.58f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-1.885f, 0.0f, -3.618f, 0.949f, -4.636f, 2.539f)
                lineToRelative(-0.541f, 0.845f)
                lineToRelative(-3.365f, -2.166f)
                lineToRelative(1.082f, -1.682f)
                lineToRelative(1.735f, 1.116f)
                curveToRelative(1.202f, -1.423f, 2.879f, -2.341f, 4.724f, -2.586f)
                lineTo(13.999f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.067f)
                curveToRelative(1.882f, 0.252f, 3.544f, 1.204f, 4.717f, 2.585f)
                lineToRelative(1.744f, -1.116f)
                lineToRelative(1.078f, 1.684f)
                lineToRelative(-1.741f, 1.115f)
                curveToRelative(0.45f, 0.963f, 0.702f, 2.036f, 0.702f, 3.167f)
                curveToRelative(0.0f, 1.125f, -0.254f, 2.198f, -0.709f, 3.162f)
                close()
            }
        }
        .build()
        return _compliance!!
    }

private var _compliance: ImageVector? = null
