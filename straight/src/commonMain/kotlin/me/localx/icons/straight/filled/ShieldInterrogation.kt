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

public val Icons.Filled.ShieldInterrogation: ImageVector
    get() {
        if (_shieldInterrogation != null) {
            return _shieldInterrogation!!
        }
        _shieldInterrogation = Builder(name = "ShieldInterrogation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.944f, 2.634f)
                lineToRelative(-7.944f, -2.634f)
                lineToRelative(-7.944f, 2.634f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.056f, 2.848f)
                verticalLineToRelative(6.509f)
                curveToRelative(0.0f, 7.524f, 9.2f, 11.679f, 9.594f, 11.852f)
                lineToRelative(0.354f, 0.157f)
                lineToRelative(0.368f, -0.122f)
                curveToRelative(0.395f, -0.131f, 9.684f, -3.31f, 9.684f, -11.887f)
                verticalLineToRelative(-6.509f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.056f, -2.848f)
                close()
                moveTo(13.0f, 19.052f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.928f, 12.557f)
                arcToRelative(2.343f, 2.343f, 0.0f, false, false, -0.928f, 1.752f)
                verticalLineToRelative(0.743f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.743f)
                arcToRelative(4.309f, 4.309f, 0.0f, false, true, 1.962f, -3.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.005f, -2.125f)
                arcToRelative(2.022f, 2.022f, 0.0f, false, false, -1.6f, -1.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.367f, 1.968f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.429f, -3.065f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.5f, 6.57f)
                close()
            }
        }
        .build()
        return _shieldInterrogation!!
    }

private var _shieldInterrogation: ImageVector? = null
