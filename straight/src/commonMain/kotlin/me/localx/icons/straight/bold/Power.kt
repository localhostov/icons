package me.localx.icons.straight.bold

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

public val Icons.Bold.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.9999f, 2.7645f)
                    verticalLineTo(6.0825f)
                    curveTo(17.525f, 6.963f, 18.717f, 8.3222f, 19.3909f, 9.9492f)
                    curveTo(20.0649f, 11.5762f, 20.1831f, 13.3801f, 19.7273f, 15.0812f)
                    curveTo(19.2715f, 16.7823f, 18.2671f, 18.2854f, 16.87f, 19.3575f)
                    curveTo(15.4728f, 20.4295f, 13.761f, 21.0106f, 11.9999f, 21.0106f)
                    curveTo(10.2388f, 21.0106f, 8.527f, 20.4295f, 7.1298f, 19.3575f)
                    curveTo(5.7326f, 18.2854f, 4.7283f, 16.7823f, 4.2725f, 15.0812f)
                    curveTo(3.8167f, 13.3801f, 3.9349f, 11.5762f, 4.6089f, 9.9492f)
                    curveTo(5.2828f, 8.3222f, 6.4748f, 6.963f, 7.9999f, 6.0825f)
                    verticalLineTo(2.7645f)
                    curveTo(5.6111f, 3.6969f, 3.6232f, 5.4347f, 2.3798f, 7.6773f)
                    curveTo(1.1363f, 9.9199f, 0.7154f, 12.5265f, 1.1898f, 15.0465f)
                    curveTo(1.6642f, 17.5666f, 3.0042f, 19.8417f, 4.978f, 21.4786f)
                    curveTo(6.9519f, 23.1155f, 9.4356f, 24.0114f, 11.9999f, 24.0114f)
                    curveTo(14.5642f, 24.0114f, 17.0479f, 23.1155f, 19.0218f, 21.4786f)
                    curveTo(20.9956f, 19.8417f, 22.3356f, 17.5666f, 22.81f, 15.0465f)
                    curveTo(23.2844f, 12.5265f, 22.8635f, 9.9199f, 21.62f, 7.6773f)
                    curveTo(20.3766f, 5.4347f, 18.3886f, 3.6969f, 15.9999f, 2.7645f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.5f, 0.0f)
                    horizontalLineTo(10.5f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(13.5f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
