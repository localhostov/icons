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

public val Icons.Bold.IdCardClipAlt: ImageVector
    get() {
        if (_idCardClipAlt != null) {
            return _idCardClipAlt!!
        }
        _idCardClipAlt = Builder(name = "IdCardClipAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 4.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(2.467f, 4.0f, 0.0f, 6.468f, 0.0f, 9.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.769f)
                curveToRelative(0.346f, 0.597f, 0.992f, 1.0f, 1.731f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.739f, 0.0f, 1.385f, -0.403f, 1.731f, -1.0f)
                horizontalLineToRelative(3.769f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(9.5f, 11.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(15.975f, 18.0f)
                curveToRelative(0.062f, 0.239f, 0.009f, 0.494f, -0.143f, 0.69f)
                curveToRelative(-0.152f, 0.195f, -0.384f, 0.31f, -0.632f, 0.31f)
                horizontalLineToRelative(-6.4f)
                curveToRelative(-0.248f, 0.0f, -0.48f, -0.114f, -0.632f, -0.31f)
                curveToRelative(-0.152f, -0.196f, -0.205f, -0.45f, -0.143f, -0.69f)
                curveToRelative(0.448f, -1.739f, 2.119f, -3.0f, 3.975f, -3.0f)
                reflectiveCurveToRelative(3.526f, 1.262f, 3.975f, 3.0f)
                close()
            }
        }
        .build()
        return _idCardClipAlt!!
    }

private var _idCardClipAlt: ImageVector? = null
