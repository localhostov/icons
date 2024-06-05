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

public val Icons.Bold.StoreLock: ImageVector
    get() {
        if (_storeLock != null) {
            return _storeLock!!
        }
        _storeLock = Builder(name = "StoreLock", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 15.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 13.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.462f, 10.0f)
                curveToRelative(0.1f, 0.0f, 0.197f, -0.011f, 0.292f, -0.029f)
                curveToRelative(-0.479f, 0.906f, -0.754f, 1.936f, -0.754f, 3.029f)
                horizontalLineToRelative(-0.538f)
                curveToRelative(-1.152f, 0.0f, -2.203f, -0.435f, -3.0f, -1.149f)
                curveToRelative(-0.797f, 0.714f, -1.848f, 1.149f, -3.0f, 1.149f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.169f, 0.0f, -0.336f, -0.01f, -0.5f, -0.028f)
                verticalLineToRelative(7.528f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6.538f)
                curveToRelative(0.0f, 1.105f, 0.372f, 2.119f, 0.982f, 2.947f)
                curveToRelative(-0.171f, 0.026f, -0.342f, 0.053f, -0.52f, 0.053f)
                lineTo(4.462f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.962f, 11.325f)
                curveTo(0.337f, 10.552f, -0.038f, 9.569f, -0.038f, 8.5f)
                lineTo(2.33f, 0.0f)
                lineTo(21.594f, 0.0f)
                lineToRelative(2.368f, 8.5f)
                curveToRelative(0.0f, 0.292f, -0.033f, 0.575f, -0.086f, 0.852f)
                curveToRelative(-0.822f, -1.207f, -2.038f, -2.124f, -3.463f, -2.563f)
                lineToRelative(-1.083f, -3.788f)
                horizontalLineToRelative(-2.368f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.962f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(6.962f, 3.0f)
                horizontalLineToRelative(-2.368f)
                lineToRelative(-1.622f, 5.675f)
                curveToRelative(0.087f, 0.745f, 0.723f, 1.325f, 1.49f, 1.325f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _storeLock!!
    }

private var _storeLock: ImageVector? = null
