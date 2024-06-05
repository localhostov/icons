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

public val Icons.Bold.WalkieTalkie: ImageVector
    get() {
        if (_walkieTalkie != null) {
            return _walkieTalkie!!
        }
        _walkieTalkie = Builder(name = "WalkieTalkie", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 3.0f)
                horizontalLineToRelative(-5.5f)
                lineTo(13.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.036f)
                curveToRelative(-1.694f, 0.243f, -3.0f, 1.704f, -3.0f, 3.464f)
                verticalLineToRelative(5.948f)
                curveToRelative(0.0f, 1.018f, 0.35f, 2.016f, 0.986f, 2.811f)
                lineToRelative(1.014f, 1.268f)
                verticalLineToRelative(7.474f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-7.474f)
                lineToRelative(1.014f, -1.268f)
                curveToRelative(0.636f, -0.795f, 0.986f, -1.793f, 0.986f, -2.811f)
                verticalLineToRelative(-5.948f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19.0f, 12.448f)
                curveToRelative(0.0f, 0.339f, -0.117f, 0.672f, -0.329f, 0.937f)
                lineToRelative(-1.671f, 2.089f)
                verticalLineToRelative(5.526f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-5.526f)
                lineToRelative(-1.671f, -2.089f)
                curveToRelative(-0.212f, -0.265f, -0.329f, -0.598f, -0.329f, -0.937f)
                verticalLineToRelative(-5.948f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(5.948f)
                close()
                moveTo(7.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _walkieTalkie!!
    }

private var _walkieTalkie: ImageVector? = null
