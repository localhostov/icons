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

public val Icons.Bold.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(name = "Siren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.79f, 19.246f)
                lineToRelative(-1.473f, -15.305f)
                curveToRelative(-0.281f, -2.247f, -2.201f, -3.941f, -4.465f, -3.941f)
                horizontalLineToRelative(-7.703f)
                curveTo(5.884f, 0.0f, 3.964f, 1.694f, 3.678f, 3.984f)
                lineToRelative(-1.468f, 15.262f)
                curveToRelative(-1.293f, 0.515f, -2.21f, 1.779f, -2.21f, 3.253f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.474f, -0.917f, -2.739f, -2.21f, -3.254f)
                close()
                moveTo(8.148f, 3.0f)
                horizontalLineToRelative(7.703f)
                curveToRelative(0.755f, 0.0f, 1.395f, 0.565f, 1.484f, 1.271f)
                lineToRelative(1.417f, 14.729f)
                lineTo(5.247f, 19.0f)
                lineToRelative(1.412f, -14.686f)
                curveToRelative(0.094f, -0.75f, 0.734f, -1.314f, 1.489f, -1.314f)
                close()
                moveTo(11.232f, 9.0f)
                horizontalLineToRelative(-3.014f)
                lineToRelative(0.254f, -2.643f)
                curveToRelative(0.074f, -0.77f, 0.72f, -1.356f, 1.493f, -1.356f)
                horizontalLineToRelative(2.034f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-0.671f)
                lineToRelative(-0.096f, 1.0f)
                close()
            }
        }
        .build()
        return _siren!!
    }

private var _siren: ImageVector? = null
