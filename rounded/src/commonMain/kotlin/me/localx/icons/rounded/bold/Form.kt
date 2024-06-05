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

public val Icons.Bold.Form: ImageVector
    get() {
        if (_form != null) {
            return _form!!
        }
        _form = Builder(name = "Form", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
                moveTo(22.0f, 7.157f)
                verticalLineToRelative(11.343f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, 5.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, -5.5f, -5.5f)
                verticalLineToRelative(-13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 5.5f, -5.5f)
                horizontalLineToRelative(7.343f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 3.889f, 1.611f)
                lineToRelative(1.657f, 1.657f)
                arcToRelative(5.464f, 5.464f, 0.0f, false, true, 1.611f, 3.889f)
                close()
                moveTo(18.985f, 7.0f)
                horizontalLineToRelative(-1.985f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-1.984f)
                curveToRelative(-0.053f, -0.004f, -7.5f, -0.016f, -7.5f, -0.016f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                reflectiveCurveToRelative(-0.012f, -11.447f, -0.015f, -11.5f)
                close()
                moveTo(14.5f, 9.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
            }
        }
        .build()
        return _form!!
    }

private var _form: ImageVector? = null
