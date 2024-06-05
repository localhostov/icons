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

public val Icons.Bold.Badminton: ImageVector
    get() {
        if (_badminton != null) {
            return _badminton!!
        }
        _badminton = Builder(name = "Badminton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.335f, 16.992f)
                curveToRelative(2.35f, 0.0f, 4.823f, -0.985f, 6.747f, -2.91f)
                curveToRelative(3.532f, -3.531f, 3.9f, -8.908f, 0.822f, -11.986f)
                curveToRelative(-3.079f, -3.078f, -8.456f, -2.709f, -11.986f, 0.822f)
                curveToRelative(-3.115f, 3.115f, -3.769f, 7.667f, -1.766f, 10.809f)
                lineToRelative(-3.298f, 3.298f)
                curveToRelative(-0.752f, -0.106f, -1.543f, 0.129f, -2.121f, 0.706f)
                lineToRelative(-2.002f, 2.002f)
                curveToRelative(-0.975f, 0.975f, -0.975f, 2.561f, 0.0f, 3.536f)
                reflectiveCurveToRelative(2.561f, 0.975f, 3.536f, 0.0f)
                lineToRelative(2.002f, -2.002f)
                curveToRelative(0.577f, -0.577f, 0.812f, -1.369f, 0.706f, -2.121f)
                lineToRelative(3.297f, -3.297f)
                curveToRelative(1.201f, 0.766f, 2.608f, 1.143f, 4.062f, 1.143f)
                close()
                moveTo(12.039f, 5.039f)
                curveToRelative(1.345f, -1.345f, 3.05f, -2.043f, 4.622f, -2.043f)
                curveToRelative(1.188f, 0.0f, 2.3f, 0.399f, 3.122f, 1.221f)
                curveToRelative(1.908f, 1.909f, 1.539f, 5.382f, -0.822f, 7.744f)
                curveToRelative(-2.361f, 2.361f, -5.835f, 2.73f, -7.744f, 0.822f)
                curveToRelative(-1.908f, -1.909f, -1.539f, -5.382f, 0.822f, -7.744f)
                close()
                moveTo(22.0f, 20.5f)
                lineToRelative(1.5f, 3.5f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(1.5f, -3.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _badminton!!
    }

private var _badminton: ImageVector? = null
