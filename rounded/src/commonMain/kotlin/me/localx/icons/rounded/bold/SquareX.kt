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

public val Icons.Bold.SquareX: ImageVector
    get() {
        if (_squareX != null) {
            return _squareX!!
        }
        _squareX = Builder(name = "SquareX", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(17.661f, 7.45f)
                lineToRelative(-3.723f, 4.55f)
                lineToRelative(3.723f, 4.55f)
                curveToRelative(0.524f, 0.642f, 0.43f, 1.587f, -0.211f, 2.111f)
                curveToRelative(-0.279f, 0.228f, -0.615f, 0.339f, -0.949f, 0.339f)
                curveToRelative(-0.435f, 0.0f, -0.865f, -0.188f, -1.162f, -0.55f)
                lineToRelative(-3.339f, -4.081f)
                lineToRelative(-3.339f, 4.081f)
                curveToRelative(-0.297f, 0.362f, -0.728f, 0.55f, -1.162f, 0.55f)
                curveToRelative(-0.334f, 0.0f, -0.67f, -0.111f, -0.949f, -0.339f)
                curveToRelative(-0.641f, -0.524f, -0.735f, -1.47f, -0.211f, -2.111f)
                lineToRelative(3.723f, -4.55f)
                lineToRelative(-3.723f, -4.55f)
                curveToRelative(-0.524f, -0.642f, -0.43f, -1.587f, 0.211f, -2.111f)
                curveToRelative(0.643f, -0.523f, 1.586f, -0.43f, 2.111f, 0.211f)
                lineToRelative(3.339f, 4.081f)
                lineToRelative(3.339f, -4.081f)
                curveToRelative(0.525f, -0.641f, 1.469f, -0.734f, 2.111f, -0.211f)
                curveToRelative(0.641f, 0.524f, 0.735f, 1.47f, 0.211f, 2.111f)
                close()
            }
        }
        .build()
        return _squareX!!
    }

private var _squareX: ImageVector? = null
