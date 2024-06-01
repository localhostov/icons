package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.SignOut: ImageVector
    get() {
        if (_signOut != null) {
            return _signOut!!
        }
        _signOut = Builder(name = "SignOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 21.0f)
                    verticalLineTo(3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 21.0f)
                    curveTo(0.0f, 21.7956f, 0.3161f, 22.5587f, 0.8787f, 23.1213f)
                    curveTo(1.4413f, 23.6839f, 2.2043f, 24.0f, 3.0f, 24.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 22.0f, 2.4804f, 21.8946f, 2.2929f, 21.7071f)
                    curveTo(2.1054f, 21.5196f, 2.0f, 21.2652f, 2.0f, 21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.1231f, 9.8784f)
                    lineTo(18.5371f, 5.2924f)
                    lineTo(17.1231f, 6.7064f)
                    lineTo(21.3871f, 10.9704f)
                    lineTo(5.0001f, 10.9994f)
                    verticalLineTo(12.9994f)
                    lineTo(21.4431f, 12.9704f)
                    lineTo(17.1211f, 17.2924f)
                    lineTo(18.5351f, 18.7064f)
                    lineTo(23.1211f, 14.1204f)
                    curveTo(23.6838f, 13.5581f, 24.0001f, 12.7953f, 24.0005f, 11.9998f)
                    curveTo(24.0009f, 11.2043f, 23.6853f, 10.4413f, 23.1231f, 9.8784f)
                    close()
                }
            }
        }
        .build()
        return _signOut!!
    }

private var _signOut: ImageVector? = null
